import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL (
        "http://img.burrard-lucas.com/kenya/normal/giraffe.jpg");
        JOptionPane.showMessageDialog(null, "Im a giraffe", "title",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
