package club.krist.lc.lunarcomputing.util;

public enum Color {
    black(1644825),
    red(13388876),
    green(5744206),
    brown(8349260),
    blue(3368652),
    purple(11691749),
    cyan(5020082),
    lightGray(10066329),
    gray(5000268),
    pink(15905484),
    lime(8375321),
    yellow(14605932),
    lightBlue(10072818),
    magenta(15040472),
    orange(15905331),
    white(15790320);

    private int hex;
    private float[] rgb;

    public static Color fromInt(int colour)
    {
        if ((colour >= 0) && (colour < 16)) {
            return values()[colour];
        }
        return null;
    }

    Color(int hex)
    {
        this.hex = hex;
        this.rgb = new float[] {
                (hex >> 16 & 0xFF) / 255.0F,
                (hex >> 8 & 0xFF) / 255.0F,
                (hex & 0xFF) / 255.0F
        };
    }

    public Color getNext()
    {
        return values()[((ordinal()+1)%16)];
    }

    public Color getPrevious()
    {
        return values()[((ordinal()+15)%16)];
    }

    public int getHex()
    {
        return this.hex;
    }

    public float[] getRGB()
    {
        return this.rgb;
    }
}
