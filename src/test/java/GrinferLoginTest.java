import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import ch.qos.logback.classic.Logger;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;

public class GrinferLoginTest {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(GrinferLoginTest.class);

  private final String LINK_BY_TEXT = "//a[text()='%s']";
  private final String BUTTON_BY_TEXT = "//span[text()='%s']/ancestor::button";

  @BeforeAll
  public static void setup() {
    logger.info("Configuring Selenide");
    Configuration.startMaximized = true;
    Configuration.baseUrl = "https://grinfer.com";
  }

  @Test
  public void grifnerLoginTest() {
    open("/");
    $(By.xpath(String.format(LINK_BY_TEXT, "Log In"))).click();
    $(By.id("email")).setValue("dummy@mail.com");
    $(By.id("password")).setValue("qwerty12345");

    $(By.xpath(String.format(BUTTON_BY_TEXT, "Log in"))).shouldBe(enabled);
  }

}
