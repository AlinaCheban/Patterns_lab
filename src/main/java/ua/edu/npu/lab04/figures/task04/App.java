package ua.edu.npu.lab04.figures;

import java.util.Random;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        FigureFactory factory = new FigureFactory();

        for (int i = 0; i < 15; i++) {
            Integer figureType = r.nextInt(7)+1;
            TetrisFigure fig = factory.getFigure(figureType);
            fig.create();
            Thread.sleep(500);
        }
    }
}
