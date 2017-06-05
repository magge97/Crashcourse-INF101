

public class TetrisBoard {

  private MyGrid2D<TetrisCell> grid;

  // OPPGAVE 5
  public TetrisBoard(int width, int height) {
    grid = new MyGrid2D<TetrisCell>(width, height);
  }

  // OPPGAVE 6
  public void putPiece(IPosition pos, IGrid2D<TetrisCell> piece) {

    for (int x = 0; x < piece.getWidth(); x++) {
      for (int y = 0; y < piece.getHeight(); y++) {
        TetrisCell cell = piece.get(x, y, null);
        IPosition piecePos = pos.move(x, y);

        if (cell != null && contains(piecePos)) {
          grid.set(piecePos, cell);
        }
      }
    }
  }

  // OPPGAVE 7
  public boolean canPutPiece(IPosition pos, IGrid2D<TetrisCell> piece) {

    for (int x = 0; x < piece.getWidth(); x++){
      for (int y = 0; y < piece.getHeight(); y++) {
        TetrisCell cell = piece.get(x, y, null);

        if (piece.get(x, y) != null) {
          IPosition piecePos = pos.move(x, y);

          // outside grid
          if (!grid.contains(piecePos)){
            return false;
          }
          // placed on non-empty cell
          if (grid.get(piecePos, null) != null)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  // OPPGAVE 8
  public isFullRow (int row) {
    for (int x = 0; x < grid.getWidth(); x++) {
      if (grid.get(x, row, null) == null) {
        return false;
      }
    }
    return true;
  }

  public void deleteRow(int row) {
    for (int y = row; y < grid.getHeight() - 1; y++) {
      for (int x = 0; x grid.getWidth(); + x++) {
        grid.set(x, y, grid.get(x, y + 1));
      }
    }

    for (int x = 0; x < grid.getWidth(); x++) {
      grid.set(x, getHeight() - 1; null);
    }
  }

  // OPPGAVE 9
  public int checkRows() {
    int fullRows = 0;

    for (int y = 0; y < getHeight(); y++) {
      if (isFullRow(y)) {
        deleteRow(y);
        fullRows++;
        y--;
      }
    }
  }
}
