package me.zeroeightsix.kami.gui.kami.theme.kami;

import java.awt.*;

/**
 * @author dominikaaaa
 * Class for all the main GUI colours used by the default kami theme
 * mfw I make it easier for skids to customize kami
 */
public class KamiGuiColors {
    public enum GuiC {
        bgColour(new Color(189, 57, 55)), // normal colored
        bgColourHover(new Color(189, 57, 55)), // light colored

        buttonPressed(new Color(245, 103, 100)),

        // N = normal T = toggled
        buttonIdleN(new Color(200, 200, 200)), // lighter grey
        buttonHoveredN(new Color(190, 190, 190)), // light grey

        buttonIdleT(new Color(230, 160, 158)), // lighter colored
        buttonHoveredT((new Color(buttonIdleT.color.getRGB())).brighter()),

        windowOutline(new Color(235, 32, 28)),
        windowOutlineWidth(1.8f),

        pinnedWindow(new Color(245, 33, 29)),
        unpinnedWindow(168.3),
        lineWindow(112.2),

        sliderColour(new Color(255, 147, 145)),

        enumColour(new Color(245, 103, 100)),

        chatOutline(new Color(199, 58, 56)),

        scrollBar(new Color(245, 59, 56));

        public Color color;
        public float aFloat;
        public double aDouble;

        GuiC(Color color) {
            this.color = color;
        }

        GuiC(float aFloat) {
            this.aFloat = aFloat;
        }

        GuiC(double aDouble) {
            this.aDouble = aDouble;
        }
    }
}