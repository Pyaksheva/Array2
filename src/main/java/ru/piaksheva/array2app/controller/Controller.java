package ru.piaksheva.array2app.controller;

import ru.piaksheva.array2app.model.service.ArrayService;
import ru.piaksheva.array2app.view.PrintResult;

public class Controller {

    ArrayService arrayService;
    PrintResult printResult;

    public Controller(ArrayService arrayService, PrintResult printResult) {
        this.arrayService = arrayService;
        this.printResult = printResult;
    }

    public void sort(int[] arr) {
        arr = arrayService.sort(arr);
        printResult.printResult(arr);
    }
}
