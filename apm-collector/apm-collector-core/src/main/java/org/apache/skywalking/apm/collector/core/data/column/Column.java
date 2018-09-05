/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.collector.core.data.column;

import org.apache.skywalking.apm.collector.core.data.*;

/**
 * @author peng-yongsheng
 */
class Column {
    private final ColumnName columnName;
    private final MergeOperation mergeOperation;
    private final FormulaOperation formulaOperation;

    Column(ColumnName columnName, MergeOperation mergeOperation) {
        this.columnName = columnName;
        this.mergeOperation = mergeOperation;
        this.formulaOperation = null;
    }

    Column(ColumnName columnName, MergeOperation mergeOperation,
        FormulaOperation formulaOperation) {
        this.columnName = columnName;
        this.mergeOperation = mergeOperation;
        this.formulaOperation = formulaOperation;
    }

    public final ColumnName getColumnName() {
        return columnName;
    }

    public final MergeOperation getMergeOperation() {
        return mergeOperation;
    }

    public final FormulaOperation getFormulaOperation() {
        return formulaOperation;
    }
}