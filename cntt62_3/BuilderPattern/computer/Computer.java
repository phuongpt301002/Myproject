package creational.factory.cntt62_3.BuilderPattern.computer;

public class Computer {
    String CPU, RAM, storage, screen;

    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static class Builder{
        String CPU, RAM, storage, screen;
        public Builder buildCPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder buildRAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder buildStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder buildscreen(String screen){
            this.screen = screen;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
