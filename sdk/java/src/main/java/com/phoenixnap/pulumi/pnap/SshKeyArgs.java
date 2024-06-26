// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshKeyArgs Empty = new SshKeyArgs();

    /**
     * Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     * 
     */
    @Import(name="default", required=true)
    private Output<Boolean> default_;

    /**
     * @return Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     * 
     */
    public Output<Boolean> default_() {
        return this.default_;
    }

    /**
     * SSH key actual key value.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return SSH key actual key value.
     * 
     */
    public Output<String> key() {
        return this.key;
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

    private SshKeyArgs() {}

    private SshKeyArgs(SshKeyArgs $) {
        this.default_ = $.default_;
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshKeyArgs $;

        public Builder() {
            $ = new SshKeyArgs();
        }

        public Builder(SshKeyArgs defaults) {
            $ = new SshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
         * 
         * @return builder
         * 
         */
        public Builder default_(Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param key SSH key actual key value.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key SSH key actual key value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
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

        public SshKeyArgs build() {
            if ($.default_ == null) {
                throw new MissingRequiredPropertyException("SshKeyArgs", "default_");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("SshKeyArgs", "key");
            }
            return $;
        }
    }

}
