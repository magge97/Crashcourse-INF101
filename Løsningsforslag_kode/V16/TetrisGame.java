// OPPGAVE 10

public class TetrisGame {

  private TetrisBoard board;
  private IGrid2D<TetrisCell> piece;
  private IPosition piecePos;

  public void step() {

    IPosition newPos = piecePos.south();

    if (board.canPutPiece(newPos, piece)) {
      piecePos = newPos;
    } else {
      board.putPiece(piecePos, piece);
      int rowsDeleted = checkRows();
      newPiece()
    }
  }


}
