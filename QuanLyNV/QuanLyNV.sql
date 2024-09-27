CREATE DATABASE QuanLyNV;
USE QuanLyNV;

CREATE TABLE department (
    departmentid VARCHAR(10) PRIMARY KEY,
    departmentname VARCHAR(50) NOT NULL
);

CREATE TABLE employee (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    sex VARCHAR(10) NOT NULL,
    address VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(15),
    departmentid VARCHAR(10),
    FOREIGN KEY (departmentid) REFERENCES department(departmentid) ON DELETE CASCADE
);
