package thesis;

import static org.junit.Assert.assertNull;

import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.assertj.swing.core.MouseButton;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.image.ScreenshotTaker;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;

public class Test extends AssertJSwingJUnitTestCase {

	private FrameFixture window;

	@Override
	protected void onSetUp() {
		FrameYo frame = GuiActionRunner.execute(() -> new FrameYo());
		// IMPORTANT: note the call to 'robot()'
		// we must use the Robot from AssertJSwingJUnitTestCase
		window = new FrameFixture(robot(), frame);
		window.show(); // shows the frame to test
	}

	@org.junit.Test
	public void testMethod() {


//		try {
//			Thread.sleep(60000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ScreenshotTaker t = new ScreenshotTaker();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		t.saveDesktopAsPng(sdf.format(d)+"--1.png");
		
		window.textBox("entertext").requireEmpty();
		window.textBox("textarea").requireEmpty();

		window.textBox("entertext").enterText("testtext");
		window.button("sendbutton").click();
		window.textBox("textarea").requireText("testtext");
		t.saveDesktopAsPng(sdf.format(d)+"--2.png");

//		robot().click(new Point(50, 50), MouseButton.LEFT_BUTTON, 1);

//		try {
//			Thread.sleep(60000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@org.junit.Test
	public void testWorks() {

		assertNull(null);

	}
}
