package com.valsight.testtask.util;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<String> columns;
    private List<List<Object>> rows;


    public Table() {
        columns = new ArrayList<>();
        rows = new ArrayList<>();
    }
}
