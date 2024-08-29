/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

/**
 *
 * @author ADMIN
 */
public class CauThu {

    private int soao;
    private String hoten;
    private int namsinh;
    private double tienthuong;
    private double tienphat;
    private int luongcung;

    public CauThu(int soao, String hoten, int namsinh, double tienthuong, double tienphat, int luongcung) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    CauThu(String hoTen, int namSinh, int soAo, double luong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public double tinhLuongThucLanh() {
        return luongcung + tienthuong - tienphat;
    }

    @Override
    public String toString() {
        return "CauThu{" + "soao=" + soao + ", hoten=" + hoten + ", namsinh=" + namsinh + ", tienthuong=" + tienthuong + ", tienphat=" + tienphat + ", luongcung=" + luongcung + '}';
    }

    int getSoAo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean getLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
