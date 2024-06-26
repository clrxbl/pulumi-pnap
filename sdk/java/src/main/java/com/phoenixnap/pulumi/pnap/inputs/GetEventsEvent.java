// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.GetEventsEventUserInfo;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEventsEvent extends com.pulumi.resources.InvokeArgs {

    public static final GetEventsEvent Empty = new GetEventsEvent();

    /**
     * Event name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Event name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The UTC time the event initiated.
     * 
     */
    @Import(name="timestamp", required=true)
    private String timestamp;

    /**
     * @return The UTC time the event initiated.
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * Details related to the user / application.
     * 
     */
    @Import(name="userInfos", required=true)
    private List<GetEventsEventUserInfo> userInfos;

    /**
     * @return Details related to the user / application.
     * 
     */
    public List<GetEventsEventUserInfo> userInfos() {
        return this.userInfos;
    }

    private GetEventsEvent() {}

    private GetEventsEvent(GetEventsEvent $) {
        this.name = $.name;
        this.timestamp = $.timestamp;
        this.userInfos = $.userInfos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventsEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventsEvent $;

        public Builder() {
            $ = new GetEventsEvent();
        }

        public Builder(GetEventsEvent defaults) {
            $ = new GetEventsEvent(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Event name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param timestamp The UTC time the event initiated.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(String timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param userInfos Details related to the user / application.
         * 
         * @return builder
         * 
         */
        public Builder userInfos(List<GetEventsEventUserInfo> userInfos) {
            $.userInfos = userInfos;
            return this;
        }

        /**
         * @param userInfos Details related to the user / application.
         * 
         * @return builder
         * 
         */
        public Builder userInfos(GetEventsEventUserInfo... userInfos) {
            return userInfos(List.of(userInfos));
        }

        public GetEventsEvent build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetEventsEvent", "name");
            }
            if ($.timestamp == null) {
                throw new MissingRequiredPropertyException("GetEventsEvent", "timestamp");
            }
            if ($.userInfos == null) {
                throw new MissingRequiredPropertyException("GetEventsEvent", "userInfos");
            }
            return $;
        }
    }

}
