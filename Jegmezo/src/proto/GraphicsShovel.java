package proto;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * A grafikus lap�t megjelenit�s�t megval�sit� oszt�ly.
 */
public class GraphicsShovel extends GraphicsTool {

	/**
	 * A Draw f�ggv�nyt val�sitja meg a lap�t grafikus elemre.
	 * @param g - Graphics objektum, amelyre ker�l a megjelenitet, lap�tnak megfelel� k�p.
	 * @param width - a megjelenitett k�p sz�less�ge
	 * @param height - a megjelenitett k�p magass�ga
	 */
	public void Draw(Graphics g, int width, int height){
		int x=poz.x;
		int y=poz.y;
		BufferedImage image = null;
		String path = ".\\src\\proto\\graphics\\lapat.png";
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		image = Utils.resize(image, width, height);
		g.drawImage(image, x, y, null);
	}

}
