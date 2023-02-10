package is.hi.hbv501g.hbv1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;
import is.hi.hbv501g.hbv1.Persistence.Entities.Parent;
import is.hi.hbv501g.hbv1.Services.DaycareWorkerService;
import is.hi.hbv501g.hbv1.Services.ParentService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller for auth0 logic.
 */
@Controller
public class AuthController {
    @Autowired
    private DaycareWorkerService daycareWorkerService;
    @Autowired
    private ParentService parentService;

    /**
     * GET on /api/isauthenticated
     * @param model
     * @param principal currently logged-in user
     * @param httpServletRequest the request
     * @param httpServletResponse the response
     * @return parent or daycareworker
     */
    @GetMapping("/api/isauthenticated")
    public ResponseEntity<Object> home(Model model, @AuthenticationPrincipal OidcUser principal,
            HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        if (principal != null) {
            String email = principal.getEmail();
            DaycareWorker dcw = daycareWorkerService.findDaycareWorkerByEmail(email);
            if (dcw == null) {
                Parent parent = parentService.findParentByEmail(email);
                return new ResponseEntity<>(parent, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(dcw, HttpStatus.OK);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
        }
    }

}