package com.globallogic.snake.model;

/**
 * User: oleksandr.baglai
 * Date: 10/1/12
 * Time: 6:56 AM
 */
public interface SnakeFactory {
    Snake create(int x, int y);
}
