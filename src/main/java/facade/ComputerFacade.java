package facade;

public class ComputerFacade {

    private CPU processor;
    private Memory memory;
    private HardDrive drive;

    public ComputerFacade() {
        this.processor = new CPU();
        this.memory = new Memory();
        this.drive = new HardDrive();
    }

    public ComputerFacade(CPU processor, Memory memory, HardDrive drive) {
        this.processor = processor;
        this.memory = memory;
        this.drive = drive;
    }

    public void start() {
        processor.freeze();
        memory.load(1, drive.read(3456, 89));
        processor.jump(132);
        processor.execute();
    }
}
