
public class Matrix {

    private final double[][] cells;

    public Matrix(double[][] c) {

        this.cells = new double[c.length][];
        for (int i = 0; i < c.length; i++) {
            this.cells[i] = c[i].clone();
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (double[] cell : this.cells) {
            for (int j = 0; j < cell.length; j++) {
                sb.append(String.format("%10.6f", cell[j]));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public double[][] toArray() {
        int rows = this.getRows();
        int columns = this.getColumns();
        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(this.cells[i], 0, result[i], 0, columns);
        }

        return result;
    }

    public int getRows() {
        return this.cells.length;
    }

    public int getColumns() {
        return this.cells[0].length;
    }

    public double getAt(int row, int column) {
        boolean outOfBounds = ((row < 0 || row >= this.getRows()) || (column < 0 || column >= this.getColumns()));
        if (outOfBounds) {
            throw new IllegalArgumentException("Posição fora dos limites da matriz.");
        }
        return this.cells[row][column];
    }

    public Matrix plus(Matrix b) {
        int rows = this.getRows();
        int columns = this.getColumns();
        boolean outOfBounds = ((rows != b.getRows()) || (columns != b.getColumns()));

        if (outOfBounds) {
            throw new IllegalArgumentException("As matrizes possuem dimensões diferentes");
        } else {
            double[][] result = new double[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = this.cells[i][j] + b.cells[i][j];
                }
            }

            return new Matrix(result);
        }
    }

    public Matrix minus(Matrix b) {
        int rows = this.getRows();
        int columns = this.getColumns();
        boolean outOfBounds = ((rows != b.getRows()) || (columns != b.getColumns()));

        if (outOfBounds) {
            throw new IllegalArgumentException("As matrizes possuem dimensões diferentes");
        } else {
            double[][] result = new double[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = this.cells[i][j] - b.cells[i][j];
                }
            }

            return new Matrix(result);
        }
    }

    public Matrix times(double x) {
        int rows = this.getRows();
        int columns = this.getColumns();

        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.cells[i][j] * x;
            }
        }

        return new Matrix(result);
    }

    public Matrix times(Matrix b) {

        int rowsA = this.getRows();
        int columnsA = this.getColumns();
        int rowsB = b.getRows();
        int columnsB = b.getColumns();

        if (columnsA != rowsB) {
            throw new IllegalArgumentException("As matrizes têm dimensões incompatíveis para multiplicação.");
        }

        double[][] result = new double[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += this.cells[i][k] * b.cells[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    public Matrix getTranspose() {
        int rows = this.getRows();
        int columns = this.getColumns();
        double[][] transposed = new double[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = this.cells[i][j];
            }
        }

        return new Matrix(transposed);
    }

    public boolean isSquare() {
        int rows = this.getRows();
        int columns = this.getColumns();

        return rows == columns;
    }

    public boolean isSymmetric() {
        if (!this.isSquare()) {
            return false;
        }

        Matrix transposed = this.getTranspose();

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.cells[i][j] != transposed.cells[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
