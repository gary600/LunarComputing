package club.krist.lc.lunarcomputing.util;

import java.util.Arrays;

public class TerminalBuffer {

    private TerminalLine[] buffer;
    private byte filler;
    private int width;
    private int height;

    public class TerminalLine {

        private byte[] buffer;
        private int width;
        private byte filler;

        public TerminalLine(int width, byte filler) {
            this.width = width;
            this.filler = filler;
            buffer = new byte[256];
            Arrays.fill( buffer, this.filler );
        }

        public void clearLine() {
            Arrays.fill( buffer, this.filler );
        }

        public void write(byte[] text, int pos) {
            for(int i=0;i<=text.length && i < width;i++) {
                buffer[i+pos] = text[i];
            }
        }
    }

    public TerminalBuffer(int width, int height, byte filler) {
        this.filler = filler;
        this.width = width;
        this.height = height;

        buffer = new TerminalLine[height];
        for(int i=0;i<width;i++) {
            buffer[i] = new TerminalLine(width, this.filler);
        }
    }

    /**
     * Clears the buffer.
     */
    public void clear() {
        for(int i=0;i<width;i++) {
            buffer[i].clearLine();
        }
    }

    /**
     * Clears specified line.
     */
    public void clearLine(int index) throws IllegalArgumentException {
        if(index > this.height)
            throw new IllegalArgumentException("index too high");

        buffer[index].clearLine();
    }

    /**
     * Scroll terminal
     * @param amount y delta
     */
    public void scroll(int amount) {
        if(amount == 0) return;

        TerminalLine[] newbuffer = new TerminalLine[this.height];

        for(int i=0; i<this.height; i++) {
            int ni = i + amount;
            if (ni>=0 && ni < this.height) {
                newbuffer[i] = buffer[ni];
            } else {
                newbuffer[i].clearLine();
            }
        }

    }

    /**
     * blit
     * @param x
     * @param y
     * @param values
     */
    public void blit(int x, int y, byte[] values) {
        buffer[y].write(values, x);
    }
}
