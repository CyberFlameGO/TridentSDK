/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2016 The TridentSDK Team
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
package net.tridentsdk.event;

/**
 * An event aggregator which coerces dispatched events to
 * their respective event listeners on the correct thread
 * pool.
 *
 * @author TridentSDK
 * @since 0.5-alpha
 */
public interface EventDispatcher {
    /**
     * Registers the listener class to be parsed to search
     * for event handler methods.
     *
     * @param listener the listener to register
     */
    void register(Object listener);

    /**
     * Removes the listener from the mapping queue for
     * dispatched events.
     *
     * @param listener the listener to remove
     */
    void unregister(Object listener);

    /**
     * Dispatches the given event to the registered
     * listener classes.
     *
     * @param event the event to dispatch
     */
    void dispatch(Event event);
}