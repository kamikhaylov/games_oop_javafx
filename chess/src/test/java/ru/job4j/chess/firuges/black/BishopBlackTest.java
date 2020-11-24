package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void checkPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell position = bishopBlack.position();
        assertThat(position, is(Cell.C1));
    }

    @Test
    public void checkCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure copy = bishopBlack.copy(Cell.D2);
        Cell position = copy.position();
        assertThat(position, is(Cell.D2));
    }

    @Test
    public void checkWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] arrayWay = bishopBlack.way(Cell.G5);
        assertArrayEquals(arrayWay, new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }
}