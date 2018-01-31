/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel;

import io.netty.util.concurrent.OrderedEventExecutor;

/**
 * Will handle all the I/O operations for a {@link Channel} once registered.    // 在一个channel注册成功后,EventLoop会处理channel所有的I/O操作!
 *
 * One {@link EventLoop} instance will usually handle more than one {@link Channel} but this may depend on
 * implementation details and internals.    // 一个EventLoop实例常常会处理多个channel, 依赖于具体的实现细节和内部机制
 *
 */
public interface EventLoop extends OrderedEventExecutor, EventLoopGroup {   // EventLoop和EventLoopGroup是netty的核心线程模型
    @Override
    EventLoopGroup parent();    // EventLoopGroup和EventLoop是一对多的关系, 这里是找到所属的EventLoopGroup
}
