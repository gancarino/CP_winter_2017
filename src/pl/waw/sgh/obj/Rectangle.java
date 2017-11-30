package pl.waw.sgh.obj;

    public class Rectangle {
        double sideA;
        double sideB;

        public Rectangle() {
            this.sideA = 10;
            this.sideB = 15;
        }

        public void setParams(double sideA, double sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
        }

        public double calcSurface() {
            return sideA*sideB;
        }
    }

