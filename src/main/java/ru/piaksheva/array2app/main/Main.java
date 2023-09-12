package ru.piaksheva.array2app.main;

import ru.piaksheva.array2app.controller.Controller;
import ru.piaksheva.array2app.model.service.ArrayService;
import ru.piaksheva.array2app.view.PrintResult;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 4, -2, 9};
        Controller controller = new Controller();
        controller.sort(arr);
    }
}
