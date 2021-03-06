package org.firepick.relation;
/*
    Copyright (C) 2013 Karl Lew <karl@firepick.org>. All rights reserved.
    DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
    
    This file is part of FirePick Software.
    
    FirePick Software is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FirePick Software is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with FirePick Software.  If not, see <http://www.gnu.org/licenses/>.
    
    For more information about FirePick Software visit http://firepick.org
 */

import java.text.Format;

public class ColumnDescription<T> implements IColumnDescription<T> {
    private String id;
    private String title;
    private FixedWidthFormat format;
    private int index;
    private IAggregator<T> aggregator;

    public String getId() {
        return id;
    }

    public ColumnDescription setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ColumnDescription setTitle(String title) {
        this.title = title;
        return this;
    }

    public Format getFormat() {
        return format;
    }

    public ColumnDescription setFormat(Format format) {
        this.format = new FixedWidthFormat(0, format);
        return this;
    }

    public int getItemIndex() {
        return index;
    }

    public ColumnDescription setIndex(int index) {
        this.index = index;
        return this;
    }

    public IAggregator<T> getAggregator() {
        return aggregator;
    }

    public ColumnDescription setAggregator(IAggregator<T> aggregator) {
        this.aggregator = aggregator;
        return this;
    }

    public int getWidth() {
        return format == null ? 0 : format.getWidth();
    }

    public ColumnDescription setWidth(int width) {
        format.setWidth(width);
        return this;
    }

    @Override
    public String toString() {
        return getId();
    }
}
