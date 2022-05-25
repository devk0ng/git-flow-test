package com.example.springtest.pay;

import java.util.*;

public class main {
    static Map<Maze, Boolean> checkMap = new HashMap<>();

    static class Maze {
        int curX;
        int curY;
        int nextX;
        int nextY;

        public Maze(int curX, int curY, int nextX, int nextY) {
            this.curX = curX;
            this.curY = curY;
            this.nextX = nextX;
            this.nextY = nextY;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Maze maze = (Maze) o;
            return curX == maze.curX && curY == maze.curY && nextX == maze.nextX && nextY == maze.nextY;
        }

        @Override
        public int hashCode() {
            return Objects.hash(curX, curY, nextX, nextY);
        }

        @Override
        public String toString() {
            return "Maze{" +
                    "curX=" + curX +
                    ", curY=" + curY +
                    ", nextX=" + nextX +
                    ", nextY=" + nextY +
                    '}';
        }
    }

    static void calculateColumnMazeRoute(Maze baseRoute, int constant) {
        checkMap.put(new Maze(baseRoute.curX, baseRoute.curY + constant, baseRoute.nextX, baseRoute.nextY + constant)
                , true);
    }

    static void calculateRowMazeRoute(Maze baseRoute, int constant) {
        checkMap.put(new Maze(baseRoute.curX+ constant, baseRoute.curY , baseRoute.nextX+ constant, baseRoute.nextY)
                , true);
    }

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;

        List<Maze> baseMaze = new ArrayList<>();
        baseMaze.add(new Maze(1, 1, 2, 1));
        baseMaze.add(new Maze(2, 1, 2, 2));
        baseMaze.add(new Maze(2, 2, 2, 3));
        baseMaze.add(new Maze(1, 2, 1, 3));
        baseMaze.add(new Maze(2, 2, 1, 2));

        // 1단계
        for (int i = 0; i < cols; i++) {
            for(int j=0 ; j<baseMaze.size() ; j++) {
                calculateColumnMazeRoute(baseMaze.get(j), i * cols);
            }
        }

        List<Maze> newBaseMaze = new ArrayList<>(checkMap.keySet());
        for (int i=1 ; i<rows ; i++) {
            for(int j=0 ; j<newBaseMaze.size() ; j++) {
                calculateRowMazeRoute(newBaseMaze.get(j), i * rows);
            }
        }

        // 2단계



    }
}
