package com.kaveinga.io.excel.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import com.kaveinga.io.models.User;

public class ExcelWriterTests {

    @Test
    public void generateExcel() throws IOException {

        // Create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet
        XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");

        // Create row object
        XSSFRow row;

        List<User> users = Arrays.asList(new User("lau", "kaveinga", "lkaveinga@gmail.com"),
                new User("kinga", "kaveinga", "kkaveinga@gmail.com"),
                new User("fusi", "kaveinga", "fkaveinga@gmail.com"));

        int rowid = 0;

        // rows
        for (User user : users) {
            row = spreadsheet.createRow(rowid++);
            int cellid = 0;

            // columns
            Cell firstNameCell = row.createCell(cellid++);
            firstNameCell.setCellValue(user.getFirstName());

            Cell lastNameCell = row.createCell(cellid++);
            lastNameCell.setCellValue(user.getLastName());

            Cell emailCell = row.createCell(cellid++);
            emailCell.setCellValue(user.getEmail());

            Cell uuidCell = row.createCell(cellid++);
            uuidCell.setCellValue(user.getUuid());
        }
        // Write the workbook in file system
        String fileName = UUID.randomUUID().toString() + ".xlsx";
        FileOutputStream out = new FileOutputStream(new File(fileName));

        workbook.write(out);
        out.close();

        System.out.println(fileName + " written successfully");
    }
}
