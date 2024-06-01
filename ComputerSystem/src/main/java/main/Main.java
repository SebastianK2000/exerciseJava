package main;

import main.drive.HDDDrive;
import main.drive.SSDDrive;
import main.usbdevice.MemoryStick;
import main.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        HDDDrive drive = new HDDDrive();

        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("test1.jpg"));
//        drive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);
    }
}