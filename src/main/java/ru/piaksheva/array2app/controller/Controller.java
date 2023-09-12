package ru.piaksheva.array2app.controller;

import ru.piaksheva.array2app.model.service.ArrayService;
import ru.piaksheva.array2app.view.PrintResult;

public class Controller {

    ArrayService arrayService = new ArrayService();
    PrintResult printResult = new PrintResult();

    public void sort(int[] arr) {
        arr = arrayService.sort(arr);
        printResult.printResult(arr);
    }
}
