import org.example.Base.LoginPage;
import org.example.Base.Registrationpage;
import org.testng.annotations.Test;


@Test
public class FacebookTest extends AbstractFacebookTest{

    LoginPage loginPage = new LoginPage();
    Registrationpage registrationpage = new Registrationpage();

    @Test(enabled = true)
    public void launchTheBrowser() throws InterruptedException {
        loginPage.launchWebsite();
        loginPage.enterAEmailAndPassword();

    }
    @Test(enabled = false)
    public void createTheRegistrationPage(){
        registrationpage.registerPage();


    }





    }

