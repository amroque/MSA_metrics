package org.cenidet;

import java.io.Serializable;

public class UIDimension implements Serializable {
    private int windowWidth;
    private int windowHeight;
    private int panelPathWidth;
    private int panelPathHeight;
    private int panelViewWidth;
    private int panelViewHeight;
    private int areaViewWidth;
    private int areaViewHeight;

    public UIDimension() {}

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public int getPanelPathWidth() {
        return panelPathWidth;
    }

    public void setPanelPathWidth(int panelPathWidth) {
        this.panelPathWidth = panelPathWidth;
    }

    public int getPanelPathHeight() {
        return panelPathHeight;
    }

    public void setPanelPathHeight(int panelPathHeight) {
        this.panelPathHeight = panelPathHeight;
    }

    public int getPanelViewWidth() {
        return panelViewWidth;
    }

    public void setPanelViewWidth(int panelViewWidth) {
        this.panelViewWidth = panelViewWidth;
    }

    public int getPanelViewHeight() {
        return panelViewHeight;
    }

    public void setPanelViewHeight(int panelViewHeight) {
        this.panelViewHeight = panelViewHeight;
    }

    public int getAreaViewWidth() {
        return areaViewWidth;
    }

    public void setAreaViewWidth(int areaViewWidth) {
        this.areaViewWidth = areaViewWidth;
    }

    public int getAreaViewHeight() {
        return areaViewHeight;
    }

    public void setAreaViewHeight(int areaViewHeight) {
        this.areaViewHeight = areaViewHeight;
    }
}
