package org.cenidet;

import java.util.List;

public class MethodParam {
private String methodname;
    private List<String> paramsIPR;
    private List<String> paramsOPR;
    private int longitudIPR;
    private int longitudOPR;
    private double DGS;
    private double FGS;
    private double SGM;
    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getFGS() {
        return FGS;
    }

    public void setFGS(double FGS) {
        this.FGS = FGS;
    }

    public double getSGM() {
        return SGM;
    }

    public void setSGM(double SGM) {
        this.SGM = SGM;
    }

    public double getDGS() {
        return DGS;
    }

    public void setDGS(double DGS) {
        this.DGS = DGS;
    }

    public int getLongitudIPR() {
        return longitudIPR;
    }

    public void setLongitudIPR(int longitudIPR) {
        this.longitudIPR = longitudIPR;
    }

    public int getLongitudOPR() {
        return longitudOPR;
    }

    public void setLongitudOPR(int longitudOPR) {
        this.longitudOPR = longitudOPR;
    }

    public List<String> getParamsIPR() {
        return paramsIPR;
    }

    public void setParamsIPR(List<String> paramsIPR) {
        this.paramsIPR = paramsIPR;
    }

    public List<String> getParamsOPR() {
        return paramsOPR;
    }

    public void setParamsOPR(List<String> paramsOPR) {
        this.paramsOPR = paramsOPR;
    }


    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname;
    }



}
