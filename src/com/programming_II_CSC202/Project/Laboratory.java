package com.programming_II_CSC202.Project;

public class Laboratory {
    private int sbp;
    private int dbp;
    private double fbs;
    private double chol;
    private double hdl;
    private double idl;
    private double tg;
    private double hba1c;

    public Laboratory(int sbp, int dbp, double fbs, double chol, double hdl, double idl, double tg, double hba1c) {
        this.sbp = sbp;
        this.dbp = dbp;
        this.fbs = fbs;
        this.chol = chol;
        this.hdl = hdl;
        this.idl = idl;
        this.tg = tg;
        this.hba1c = hba1c;
    }

    public Laboratory() {
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getDbp() {
        return dbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public double getFbs() {
        return fbs;
    }

    public void setFbs(double fbs) {
        this.fbs = fbs;
    }

    public double getChol() {
        return chol;
    }

    public void setChol(double chol) {
        this.chol = chol;
    }

    public double getHdl() {
        return hdl;
    }

    public void setHdl(double hdl) {
        this.hdl = hdl;
    }

    public double getIdl() {
        return idl;
    }

    public void setIdl(double idl) {
        this.idl = idl;
    }

    public double getTg() {
        return tg;
    }

    public void setTg(double tg) {
        this.tg = tg;
    }

    public double getHba1c() {
        return hba1c;
    }

    public void setHba1c(double hba1c) {
        this.hba1c = hba1c;
    }
}
