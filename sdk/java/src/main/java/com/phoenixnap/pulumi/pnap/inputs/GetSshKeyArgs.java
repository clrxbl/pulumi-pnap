// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSshKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshKeyArgs Empty = new GetSshKeyArgs();

    /**
     * The unique identifier of the SSH Key.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The unique identifier of the SSH Key.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Friendly SSH key name to represent an SSH key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly SSH key name to represent an SSH key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSshKeyArgs() {}

    private GetSshKeyArgs(GetSshKeyArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshKeyArgs $;

        public Builder() {
            $ = new GetSshKeyArgs();
        }

        public Builder(GetSshKeyArgs defaults) {
            $ = new GetSshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier of the SSH Key.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier of the SSH Key.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Friendly SSH key name to represent an SSH key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly SSH key name to represent an SSH key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetSshKeyArgs build() {
            return $;
        }
    }

}
