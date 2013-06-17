import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class GTalkLoginTest {

    public static final int WAIT_FOR_PROCESS_TO_COMPLETE = 2000;
    public static Process gTalkProcess;
    public Robot robot;

    @BeforeClass
    public static void openGTalk() {
        try {
            gTalkProcess = Runtime.getRuntime().exec("C:\\GoogleTalk\\googletalk.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void shouldClickOKOnWrongAccountDetails() {
        clearUsername();
        setUsernameAndPassword();
        login();
        clickOKOnModalWindow();
    }

    @AfterClass
    public static void closeGTalkProcess() {
        gTalkProcess.destroy();
    }

    private void clickOKOnModalWindow() {
        robot.mouseMove(668, 437);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    private void login() {
        robot.keyPress(KeyEvent.VK_ENTER);
        try {
            Thread.sleep(WAIT_FOR_PROCESS_TO_COMPLETE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void setUsernameAndPassword() {
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyPress(KeyEvent.VK_D);
    }


    private void clearUsername() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        waitForProcessToComplete();
        robot.mouseMove(452, 299);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
    }

    private void waitForProcessToComplete() {
        try {
            Thread.sleep(WAIT_FOR_PROCESS_TO_COMPLETE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
