package Laborator5.advanced;

public abstract class ACalculator {

        protected Object state;

        public Object result() {
            return this.state;
        }

        public ACalculator clear() {
            init();
            return this;
        }

        protected abstract void init();
    }

