package Laborator11;
 import Laborator10.IStudentiExport;
 import Laborator10.Student;
 import java.util.List;

public class TimerExportDecorator implements IStudentiExport {
    private final IStudentiExport decoratedExporter;

    public TimerExportDecorator(IStudentiExport decoratedExporter){
        this.decoratedExporter= decoratedExporter;
    }

    public void doExport(List<Student> studenti){
        long startTime = System.currentTimeMillis();

        decoratedExporter.doExport(studenti);

        long endTime= System.currentTimeMillis();
        long executionTime= endTime - startTime;

        System.out.println(" [Decorator] Timpul de executie al exportului: " + executionTime + " ms ");
    }
}
