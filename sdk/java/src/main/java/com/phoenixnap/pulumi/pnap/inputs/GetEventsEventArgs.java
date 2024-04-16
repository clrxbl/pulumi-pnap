// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.GetEventsEventUserInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEventsEventArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEventsEventArgs Empty = new GetEventsEventArgs();

    /**
     * Event name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Event name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The UTC time the event initiated.
     * 
     */
    @Import(name="timestamp", required=true)
    private Output<String> timestamp;

    /**
     * @return The UTC time the event initiated.
     * 
     */
    public Output<String> timestamp() {
        return this.timestamp;
    }

    /**
     * Details related to the user / application.
     * 
     */
    @Import(name="userInfos", required=true)
    private Output<List<GetEventsEventUserInfoArgs>> userInfos;

    /**
     * @return Details related to the user / application.
     * 
     */
    public Output<List<GetEventsEventUserInfoArgs>> userInfos() {
        return this.userInfos;
    }

    private GetEventsEventArgs() {}

    private GetEventsEventArgs(GetEventsEventArgs $) {
        this.name = $.name;
        this.timestamp = $.timestamp;
        this.userInfos = $.userInfos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventsEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventsEventArgs $;

        public Builder() {
            $ = new GetEventsEventArgs();
        }

        public Builder(GetEventsEventArgs defaults) {
            $ = new GetEventsEventArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Event name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Event name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param timestamp The UTC time the event initiated.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(Output<String> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param timestamp The UTC time the event initiated.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(String timestamp) {
            return timestamp(Output.of(timestamp));
        }

        /**
         * @param userInfos Details related to the user / application.
         * 
         * @return builder
         * 
         */
        public Builder userInfos(Output<List<GetEventsEventUserInfoArgs>> userInfos) {
            $.userInfos = userInfos;
            return this;
        }

        /**
         * @param userInfos Details related to the user / application.
         * 
         * @return builder
         * 
         */
        public Builder userInfos(List<GetEventsEventUserInfoArgs> userInfos) {
            return userInfos(Output.of(userInfos));
        }

        /**
         * @param userInfos Details related to the user / application.
         * 
         * @return builder
         * 
         */
        public Builder userInfos(GetEventsEventUserInfoArgs... userInfos) {
            return userInfos(List.of(userInfos));
        }

        public GetEventsEventArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetEventsEventArgs", "name");
            }
            if ($.timestamp == null) {
                throw new MissingRequiredPropertyException("GetEventsEventArgs", "timestamp");
            }
            if ($.userInfos == null) {
                throw new MissingRequiredPropertyException("GetEventsEventArgs", "userInfos");
            }
            return $;
        }
    }

}
