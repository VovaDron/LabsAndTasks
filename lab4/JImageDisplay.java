package lab4;

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

class JImageDisplay extends JComponent
{
    /**
     * Экземпляр буферизованного изображения.
     * Управляет изображением, содержимое которого мы можем писать.
     */
    private BufferedImage displayImage;

    /**
     * Метод получения отображаемого изображения из другого класса.
     */
    public BufferedImage getImage() {
        return displayImage;
    }

    /**
     *отображает фрактал,и объект JButton для сброса изображения, необходимый для отображения целого фрактала.
     * Данный макет можно создать, установив для фрейма BorderLayout,
     * затем поместив отображение в центр макета и кнопку сброса в "южной" части макета.
     */
    public JImageDisplay(int width, int height) {
        displayImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        /**
         * Вызваем метод setPreferredSize() родительского класса
         * с заданной шириной и высотой.
         */
        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension);

    }
    /**
     * Реализация суперкласса paintComponent(g) вызывает так, что границы и
     * черты нарисованы правильно. Затем изображение втягивается в компонент.
     */

    /**g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
     Мы передаем значение null для ImageObserver, поскольку данная функциональность не требуется*/
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(displayImage, 0, 0, displayImage.getWidth(),
                displayImage.getHeight(), null);
    }
    /**
     * Устанавливает все пиксели в данных изображения черными.
     */
    // public void clearImage()
    // {
    //     int[] blankArray = new int[getWidth() * getHeight()];
    //     displayImage.setRGB(0, 0, getWidth(), getHeight(), blankArray, 0, 1);
    // }
    /**
     * Устанавливает пиксель определенного цвета.
     */
    public void drawPixel(int x, int y, int rgbColor)
    {
        displayImage.setRGB(x, y, rgbColor);
    }
}