/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flow.platform.api.domain.response;

import com.flow.platform.api.domain.user.User;
import com.flow.platform.domain.Jsonable;
import com.google.gson.annotations.Expose;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhl
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserListResponse extends Jsonable {

    @Expose
    private Long total;

    @Expose
    private Long adminCount;

    @Expose
    private List<User> users;
}

