package com.google;

import java.io.File;
import java.io.PrintWriter;

public class javaAuto {
    public static void run()
    {
        try
        {
            Runtime r= Runtime.getRuntime();
            r.exec("cd.> plc.py");
            r.exec("cd.> x.x");
            r.exec("cd.> y.y");
            r.exec("cd.> c.c");
            r.exec("cd.> k.k");
            File f = new File("plc.py");
            PrintWriter printWriter=new PrintWriter(f);
            printWriter.write("o = open('x.x', 'r')\n" +
                    "o1 = open('y.y', 'r')\n" +
                    "o2 = open('c.c', 'r')\n" +
                    "o3 = open('k.k', 'r')\n" +
                    "from pynput.mouse import Controller as m, Button\n" +
                    "from pynput.keyboard import Controller as k, Key \n" +
                    "or1 = int(o.read())\n" +
                    "or2 = int(o1.read())\n" +
                    "if o.read() == '':\n" +
                    "    exit()\n" +
                    "if o1.read() == '':\n" +
                    "    exit()\n" +
                    "else:\n" +
                    "    mouse = m\n" +
                    "    mouse.position = (or1, or2)\n" +
                    "    mouse.click(Button, int(o2.read()))\n" +
                    "    exec(o3.read())\n" +
                    "o.close()\n" +
                    "o1.close()\n" +
                    "o2.close()\n" +
                    "o3.close()");
            printWriter.close();
            r.exec("python plc.py");
            r.exec("del plc.py");
            r.exec("del x.x");
            r.exec("del y.y");
            r.exec("del c.c");
            r.exec("del k.k");
        }
        catch (Exception e)
        {

        }
    }
    public static void mouse(int x, int y)
    {
        try {
            File f = new File("x.x");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.write(x);
            printWriter.close();
        }
        catch (Exception e)
        {

        }
        try {
            File f = new File("y.y");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.write(y);
            printWriter.close();
        }
        catch (Exception e1)
        {

        }
        run();
    }
    public static void mouse_click_left(int how)
    {
        try {
            File f = new File("c.c");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.write(how);
            printWriter.close();
        }
        catch (Exception e1)
        {

        }
        run();
    }
    public static void mouse_click_right(int how)
    {
        try {
            File f = new File("c.c");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.write(how);
            printWriter.close();
        }
        catch (Exception e1)
        {

        }
        run();
    }
    public static void keybord(String key)
    {
        try {
            File f = new File("k.k");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.write(key);
            printWriter.close();
        }
        catch (Exception e1)
        {

        }
        run();
    }
}
