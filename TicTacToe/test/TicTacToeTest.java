package test;

import org.junit.Test;
import siit.tic.tac.toe.TicTacToe;

import static org.junit.Assert.*;

public class TicTacToeTest
{
    @Test
    public void getCurrentPlayerMarkTest()
    {
        TicTacToe currentPlayerTest = new TicTacToe();
        char value = currentPlayerTest.getCurrentPlayerMark();
        assertNotNull(value);
    }

    @Test
    public void initializeBoardTest()
    {
        TicTacToe boardTest = new TicTacToe();
        boardTest.initializeBoard();
        assertNotNull(boardTest);
    }

    @Test
    public void printBoardTest()
    {
        TicTacToe printBoardd = new TicTacToe();
        printBoardd.printBoard();
        assertNotNull(printBoardd);
    }

    @Test
    public void isBoardFullTest()
    {
        TicTacToe checkIfFull = new TicTacToe();
        boolean value = checkIfFull.isBoardFull();
        assertEquals(value, false);

    }

    @Test
    public void checkForWinTest()
    {
        TicTacToe checkWin = new TicTacToe();
        boolean actualValue = checkWin.checkForWin();
        assertFalse(actualValue);
    }

    @Test
    public void placeMarkTest()
    {
        TicTacToe placeMarks = new TicTacToe();
        boolean actualValue = placeMarks.placeMark(4,4);
        assertFalse(actualValue);
    }
}
