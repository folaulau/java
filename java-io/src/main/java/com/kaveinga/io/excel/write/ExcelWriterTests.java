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

        List<User> users = Arrays.asList(new User("mem_lyqD1o0tCCQUkHjkWi4s2h2MfuyCXn"), new User("mem_N623xcu1mNhSP1ESnqgEfUKYg2IyEe"), new User("mem_EN1W3frlUX8lMGTIbXJRS5KZD1EG68"),
                new User("mem_LcC4Q1GGYHWku4oKQBk1eu8ivV2TjX"), new User("mem_ehLljUUvrlZ7wyYPRp3yFBo5jb2mac"));

        int rowid = 0;

        row = spreadsheet.createRow(rowid++);
        int cellid = 0;

        // headers
        row.createCell(cellid++).setCellValue("uuid");

        row.createCell(cellid++).setCellValue("firstname");

        row.createCell(cellid++).setCellValue("lastname");

        row.createCell(cellid++).setCellValue("email");

        // rows
        for (User user : users) {
            row = spreadsheet.createRow(rowid++);
            cellid = 0;

            // columns
            Cell uuidCell = row.createCell(cellid++);
            uuidCell.setCellValue(user.getUuid());

            Cell firstNameCell = row.createCell(cellid++);
            firstNameCell.setCellValue(user.getFirstName());

            Cell lastNameCell = row.createCell(cellid++);
            lastNameCell.setCellValue(user.getLastName());

            Cell emailCell = row.createCell(cellid++);
            emailCell.setCellValue(user.getEmail());

        }
        // Write the workbook in file system
        String fileName = "member_5_" + ".xlsx";
        FileOutputStream out = new FileOutputStream(new File(fileName));

        workbook.write(out);
        out.close();

        System.out.println(fileName + " written successfully");
    }
}
