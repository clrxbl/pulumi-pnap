// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP reservation datasource. This can be used to read reservation details.
 *
 * ## Example Usage
 *
 * Fetch a reservation by ID or SKU and show it's details in alphabetical order.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const test = pnap.getReservation({
 *     id: "e6afba51-7de8-4080-83ab-0f915570659c",
 *     sku: "XXX-XXX-XXX",
 * });
 * export const reservation = test;
 * ```
 */
export function getReservation(args?: GetReservationArgs, opts?: pulumi.InvokeOptions): Promise<GetReservationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pnap:index/getReservation:getReservation", {
        "id": args.id,
        "sku": args.sku,
    }, opts);
}

/**
 * A collection of arguments for invoking getReservation.
 */
export interface GetReservationArgs {
    /**
     * The reservation identifier.
     */
    id?: string;
    /**
     * The SKU code of product pricing plan.
     */
    sku?: string;
}

/**
 * A collection of values returned by getReservation.
 */
export interface GetReservationResult {
    /**
     * The resource ID currently being assigned to reservation.
     */
    readonly assignedResourceId: string;
    /**
     * A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
     */
    readonly autoRenew: boolean;
    /**
     * The point in time (in UTC) when the reservation ends.
     */
    readonly endDateTime: string;
    /**
     * The reservation identifier.
     */
    readonly id: string;
    /**
     * Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
     */
    readonly initialInvoiceModel: string;
    /**
     * The point in time (in UTC) when the reservation was renewed last.
     */
    readonly lastRenewalDateTime: string;
    /**
     * The location code.
     */
    readonly location: string;
    /**
     * Next billing date for reservation.
     */
    readonly nextBillingDate: string;
    /**
     * The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
     */
    readonly nextRenewalDateTime: string;
    /**
     * Reservation price.
     */
    readonly price: number;
    /**
     * The unit to which the price applies.
     */
    readonly priceUnit: string;
    /**
     * The product category.
     */
    readonly productCategory: string;
    /**
     * The code identifying the product. This code has significance across all locations.
     */
    readonly productCode: string;
    /**
     * The reservation model.
     */
    readonly reservationModel: string;
    /**
     * The SKU applied to this reservation.
     */
    readonly sku: string;
    /**
     * The point in time (in UTC) when the reservation starts.
     */
    readonly startDateTime: string;
}
/**
 * Provides a phoenixNAP reservation datasource. This can be used to read reservation details.
 *
 * ## Example Usage
 *
 * Fetch a reservation by ID or SKU and show it's details in alphabetical order.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const test = pnap.getReservation({
 *     id: "e6afba51-7de8-4080-83ab-0f915570659c",
 *     sku: "XXX-XXX-XXX",
 * });
 * export const reservation = test;
 * ```
 */
export function getReservationOutput(args?: GetReservationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetReservationResult> {
    return pulumi.output(args).apply((a: any) => getReservation(a, opts))
}

/**
 * A collection of arguments for invoking getReservation.
 */
export interface GetReservationOutputArgs {
    /**
     * The reservation identifier.
     */
    id?: pulumi.Input<string>;
    /**
     * The SKU code of product pricing plan.
     */
    sku?: pulumi.Input<string>;
}
