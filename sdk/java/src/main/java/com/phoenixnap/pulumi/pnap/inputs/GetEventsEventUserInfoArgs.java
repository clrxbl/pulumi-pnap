// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEventsEventUserInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEventsEventUserInfoArgs Empty = new GetEventsEventUserInfoArgs();

    /**
     * The BMC account ID.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The BMC account ID.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The client ID of the application.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The client ID of the application.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The logged in user or owner of the client application.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The logged in user or owner of the client application.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private GetEventsEventUserInfoArgs() {}

    private GetEventsEventUserInfoArgs(GetEventsEventUserInfoArgs $) {
        this.accountId = $.accountId;
        this.clientId = $.clientId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventsEventUserInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventsEventUserInfoArgs $;

        public Builder() {
            $ = new GetEventsEventUserInfoArgs();
        }

        public Builder(GetEventsEventUserInfoArgs defaults) {
            $ = new GetEventsEventUserInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The BMC account ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The BMC account ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param clientId The client ID of the application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client ID of the application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param username The logged in user or owner of the client application.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The logged in user or owner of the client application.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetEventsEventUserInfoArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetEventsEventUserInfoArgs", "accountId");
            }
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("GetEventsEventUserInfoArgs", "clientId");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetEventsEventUserInfoArgs", "username");
            }
            return $;
        }
    }

}