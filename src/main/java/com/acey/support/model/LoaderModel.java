package com.acey.support.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class LoaderModel {
    private Resource resource;
    private List<String> filterFiles;
}
