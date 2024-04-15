// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP Quota datasource. This can be used to read Quotas.
 *
 * ## Example Usage
 *
 * Fetch a Quota by name and show it's details in alphabetical order
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const test = pnap.getQuota({
 *     name: "Public IPs",
 * });
 * export const quota = test;
 * ```
 */
export function getQuota(args?: GetQuotaArgs, opts?: pulumi.InvokeOptions): Promise<GetQuotaResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pnap:index/getQuota:getQuota", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getQuota.
 */
export interface GetQuotaArgs {
    /**
     * The ID of the Quota.
     */
    id?: string;
    /**
     * The name of the Quota.
     */
    name?: string;
}

/**
 * A collection of values returned by getQuota.
 */
export interface GetQuotaResult {
    /**
     * The Quota description.
     */
    readonly description: string;
    /**
     * The ID of the Quota.
     */
    readonly id: string;
    /**
     * The new limit that is requested.
     */
    readonly limit: number;
    /**
     * The name of the Quota.
     */
    readonly name: string;
    /**
     * List of requests to change the limit on a Quota.
     */
    readonly quotaEditLimitRequestDetails: outputs.GetQuotaQuotaEditLimitRequestDetail[];
    /**
     * The status of the Quota.
     */
    readonly status: string;
    /**
     * Unit of the Quota type.
     */
    readonly unit: string;
    /**
     * The Quota used expressed as a number.
     */
    readonly used: number;
}
/**
 * Provides a phoenixNAP Quota datasource. This can be used to read Quotas.
 *
 * ## Example Usage
 *
 * Fetch a Quota by name and show it's details in alphabetical order
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const test = pnap.getQuota({
 *     name: "Public IPs",
 * });
 * export const quota = test;
 * ```
 */
export function getQuotaOutput(args?: GetQuotaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetQuotaResult> {
    return pulumi.output(args).apply((a: any) => getQuota(a, opts))
}

/**
 * A collection of arguments for invoking getQuota.
 */
export interface GetQuotaOutputArgs {
    /**
     * The ID of the Quota.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the Quota.
     */
    name?: pulumi.Input<string>;
}
