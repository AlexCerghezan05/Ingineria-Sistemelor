package Laborator5.advanced;

public  class NewIntCalculator extends ACalculator {

        public NewIntCalculator(Integer nrInitial) {
            this.state = nrInitial;
        }

        protected void init() {
            this.state = 0;
        }

        public NewIntCalculator add(Integer nrdeAdunat) {
            Integer valVeche = (Integer) this.state;
            this.state = valVeche + nrdeAdunat;
            return this;
        }

        public NewIntCalculator subtract(Integer numarDeScazut) {
            Integer valoareVeche = (Integer) this.state;
            this.state = valoareVeche - numarDeScazut;
            return this;
        }

        public NewIntCalculator multiply(Integer numarDeInmultit) {
            Integer valoareVeche = (Integer) this.state;
            this.state = valoareVeche * numarDeInmultit;
            return this;
        }

        public NewIntCalculator clear() {
            super.clear();
            return this;
        }
    }

