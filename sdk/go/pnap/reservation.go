// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"context"
	"reflect"

	"errors"
	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a phoenixNAP reservation resource. This can be used to create and modify reservations.
//
// ## Example Usage
//
// # Create a reservation
//
// ```go
// package main
//
// import (
//
//	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pnap.NewReservation(ctx, "test-Reservation-1", &pnap.ReservationArgs{
//				Sku: pulumi.String("XXX-XXX-XXX"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Reservation struct {
	pulumi.CustomResourceState

	// The resource ID currently being assigned to reservation.
	AssignedResourceId pulumi.StringOutput `pulumi:"assignedResourceId"`
	// A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
	AutoRenew pulumi.BoolOutput `pulumi:"autoRenew"`
	// The reason for disabling auto-renewal.
	AutoRenewDisableReason pulumi.StringPtrOutput `pulumi:"autoRenewDisableReason"`
	// The point in time (in UTC) when the reservation ends.
	EndDateTime pulumi.StringOutput `pulumi:"endDateTime"`
	// Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
	InitialInvoiceModel pulumi.StringOutput `pulumi:"initialInvoiceModel"`
	// The point in time (in UTC) when the reservation was renewed last.
	LastRenewalDateTime pulumi.StringOutput `pulumi:"lastRenewalDateTime"`
	// The location code.
	Location pulumi.StringOutput `pulumi:"location"`
	// Next billing date for reservation.
	NextBillingDate pulumi.StringOutput `pulumi:"nextBillingDate"`
	// The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
	NextRenewalDateTime pulumi.StringOutput `pulumi:"nextRenewalDateTime"`
	// Reservation price.
	Price pulumi.Float64Output `pulumi:"price"`
	// The unit to which the price applies.
	PriceUnit pulumi.StringOutput `pulumi:"priceUnit"`
	// The product category.
	ProductCategory pulumi.StringOutput `pulumi:"productCategory"`
	// The code identifying the product. This code has significance across all locations.
	ProductCode pulumi.StringOutput `pulumi:"productCode"`
	// The reservation model.
	ReservationModel pulumi.StringOutput `pulumi:"reservationModel"`
	// The SKU code of product pricing plan.
	Sku pulumi.StringOutput `pulumi:"sku"`
	// The point in time (in UTC) when the reservation starts.
	StartDateTime pulumi.StringOutput `pulumi:"startDateTime"`
}

// NewReservation registers a new resource with the given unique name, arguments, and options.
func NewReservation(ctx *pulumi.Context,
	name string, args *ReservationArgs, opts ...pulumi.ResourceOption) (*Reservation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Sku == nil {
		return nil, errors.New("invalid value for required argument 'Sku'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Reservation
	err := ctx.RegisterResource("pnap:index/reservation:Reservation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReservation gets an existing Reservation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReservation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReservationState, opts ...pulumi.ResourceOption) (*Reservation, error) {
	var resource Reservation
	err := ctx.ReadResource("pnap:index/reservation:Reservation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Reservation resources.
type reservationState struct {
	// The resource ID currently being assigned to reservation.
	AssignedResourceId *string `pulumi:"assignedResourceId"`
	// A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
	AutoRenew *bool `pulumi:"autoRenew"`
	// The reason for disabling auto-renewal.
	AutoRenewDisableReason *string `pulumi:"autoRenewDisableReason"`
	// The point in time (in UTC) when the reservation ends.
	EndDateTime *string `pulumi:"endDateTime"`
	// Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
	InitialInvoiceModel *string `pulumi:"initialInvoiceModel"`
	// The point in time (in UTC) when the reservation was renewed last.
	LastRenewalDateTime *string `pulumi:"lastRenewalDateTime"`
	// The location code.
	Location *string `pulumi:"location"`
	// Next billing date for reservation.
	NextBillingDate *string `pulumi:"nextBillingDate"`
	// The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
	NextRenewalDateTime *string `pulumi:"nextRenewalDateTime"`
	// Reservation price.
	Price *float64 `pulumi:"price"`
	// The unit to which the price applies.
	PriceUnit *string `pulumi:"priceUnit"`
	// The product category.
	ProductCategory *string `pulumi:"productCategory"`
	// The code identifying the product. This code has significance across all locations.
	ProductCode *string `pulumi:"productCode"`
	// The reservation model.
	ReservationModel *string `pulumi:"reservationModel"`
	// The SKU code of product pricing plan.
	Sku *string `pulumi:"sku"`
	// The point in time (in UTC) when the reservation starts.
	StartDateTime *string `pulumi:"startDateTime"`
}

type ReservationState struct {
	// The resource ID currently being assigned to reservation.
	AssignedResourceId pulumi.StringPtrInput
	// A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
	AutoRenew pulumi.BoolPtrInput
	// The reason for disabling auto-renewal.
	AutoRenewDisableReason pulumi.StringPtrInput
	// The point in time (in UTC) when the reservation ends.
	EndDateTime pulumi.StringPtrInput
	// Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
	InitialInvoiceModel pulumi.StringPtrInput
	// The point in time (in UTC) when the reservation was renewed last.
	LastRenewalDateTime pulumi.StringPtrInput
	// The location code.
	Location pulumi.StringPtrInput
	// Next billing date for reservation.
	NextBillingDate pulumi.StringPtrInput
	// The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
	NextRenewalDateTime pulumi.StringPtrInput
	// Reservation price.
	Price pulumi.Float64PtrInput
	// The unit to which the price applies.
	PriceUnit pulumi.StringPtrInput
	// The product category.
	ProductCategory pulumi.StringPtrInput
	// The code identifying the product. This code has significance across all locations.
	ProductCode pulumi.StringPtrInput
	// The reservation model.
	ReservationModel pulumi.StringPtrInput
	// The SKU code of product pricing plan.
	Sku pulumi.StringPtrInput
	// The point in time (in UTC) when the reservation starts.
	StartDateTime pulumi.StringPtrInput
}

func (ReservationState) ElementType() reflect.Type {
	return reflect.TypeOf((*reservationState)(nil)).Elem()
}

type reservationArgs struct {
	// A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
	AutoRenew *bool `pulumi:"autoRenew"`
	// The reason for disabling auto-renewal.
	AutoRenewDisableReason *string `pulumi:"autoRenewDisableReason"`
	// The SKU code of product pricing plan.
	Sku string `pulumi:"sku"`
}

// The set of arguments for constructing a Reservation resource.
type ReservationArgs struct {
	// A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
	AutoRenew pulumi.BoolPtrInput
	// The reason for disabling auto-renewal.
	AutoRenewDisableReason pulumi.StringPtrInput
	// The SKU code of product pricing plan.
	Sku pulumi.StringInput
}

func (ReservationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reservationArgs)(nil)).Elem()
}

type ReservationInput interface {
	pulumi.Input

	ToReservationOutput() ReservationOutput
	ToReservationOutputWithContext(ctx context.Context) ReservationOutput
}

func (*Reservation) ElementType() reflect.Type {
	return reflect.TypeOf((**Reservation)(nil)).Elem()
}

func (i *Reservation) ToReservationOutput() ReservationOutput {
	return i.ToReservationOutputWithContext(context.Background())
}

func (i *Reservation) ToReservationOutputWithContext(ctx context.Context) ReservationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservationOutput)
}

// ReservationArrayInput is an input type that accepts ReservationArray and ReservationArrayOutput values.
// You can construct a concrete instance of `ReservationArrayInput` via:
//
//	ReservationArray{ ReservationArgs{...} }
type ReservationArrayInput interface {
	pulumi.Input

	ToReservationArrayOutput() ReservationArrayOutput
	ToReservationArrayOutputWithContext(context.Context) ReservationArrayOutput
}

type ReservationArray []ReservationInput

func (ReservationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Reservation)(nil)).Elem()
}

func (i ReservationArray) ToReservationArrayOutput() ReservationArrayOutput {
	return i.ToReservationArrayOutputWithContext(context.Background())
}

func (i ReservationArray) ToReservationArrayOutputWithContext(ctx context.Context) ReservationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservationArrayOutput)
}

// ReservationMapInput is an input type that accepts ReservationMap and ReservationMapOutput values.
// You can construct a concrete instance of `ReservationMapInput` via:
//
//	ReservationMap{ "key": ReservationArgs{...} }
type ReservationMapInput interface {
	pulumi.Input

	ToReservationMapOutput() ReservationMapOutput
	ToReservationMapOutputWithContext(context.Context) ReservationMapOutput
}

type ReservationMap map[string]ReservationInput

func (ReservationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Reservation)(nil)).Elem()
}

func (i ReservationMap) ToReservationMapOutput() ReservationMapOutput {
	return i.ToReservationMapOutputWithContext(context.Background())
}

func (i ReservationMap) ToReservationMapOutputWithContext(ctx context.Context) ReservationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservationMapOutput)
}

type ReservationOutput struct{ *pulumi.OutputState }

func (ReservationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Reservation)(nil)).Elem()
}

func (o ReservationOutput) ToReservationOutput() ReservationOutput {
	return o
}

func (o ReservationOutput) ToReservationOutputWithContext(ctx context.Context) ReservationOutput {
	return o
}

// The resource ID currently being assigned to reservation.
func (o ReservationOutput) AssignedResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.AssignedResourceId }).(pulumi.StringOutput)
}

// A flag indicating whether the reservation will auto-renew (default is true, it can only be modified after the creation of resource).
func (o ReservationOutput) AutoRenew() pulumi.BoolOutput {
	return o.ApplyT(func(v *Reservation) pulumi.BoolOutput { return v.AutoRenew }).(pulumi.BoolOutput)
}

// The reason for disabling auto-renewal.
func (o ReservationOutput) AutoRenewDisableReason() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringPtrOutput { return v.AutoRenewDisableReason }).(pulumi.StringPtrOutput)
}

// The point in time (in UTC) when the reservation ends.
func (o ReservationOutput) EndDateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.EndDateTime }).(pulumi.StringOutput)
}

// Reservations created with initial invoice model ON_CREATION will be invoiced on same date when reservation is created. Reservation created with CALENDAR_MONTH initial invoice model will be invoiced at the begining of next month.
func (o ReservationOutput) InitialInvoiceModel() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.InitialInvoiceModel }).(pulumi.StringOutput)
}

// The point in time (in UTC) when the reservation was renewed last.
func (o ReservationOutput) LastRenewalDateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.LastRenewalDateTime }).(pulumi.StringOutput)
}

// The location code.
func (o ReservationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Next billing date for reservation.
func (o ReservationOutput) NextBillingDate() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.NextBillingDate }).(pulumi.StringOutput)
}

// The point in time (in UTC) when the reservation will be renewed if auto renew is set to true.
func (o ReservationOutput) NextRenewalDateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.NextRenewalDateTime }).(pulumi.StringOutput)
}

// Reservation price.
func (o ReservationOutput) Price() pulumi.Float64Output {
	return o.ApplyT(func(v *Reservation) pulumi.Float64Output { return v.Price }).(pulumi.Float64Output)
}

// The unit to which the price applies.
func (o ReservationOutput) PriceUnit() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.PriceUnit }).(pulumi.StringOutput)
}

// The product category.
func (o ReservationOutput) ProductCategory() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.ProductCategory }).(pulumi.StringOutput)
}

// The code identifying the product. This code has significance across all locations.
func (o ReservationOutput) ProductCode() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.ProductCode }).(pulumi.StringOutput)
}

// The reservation model.
func (o ReservationOutput) ReservationModel() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.ReservationModel }).(pulumi.StringOutput)
}

// The SKU code of product pricing plan.
func (o ReservationOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.Sku }).(pulumi.StringOutput)
}

// The point in time (in UTC) when the reservation starts.
func (o ReservationOutput) StartDateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Reservation) pulumi.StringOutput { return v.StartDateTime }).(pulumi.StringOutput)
}

type ReservationArrayOutput struct{ *pulumi.OutputState }

func (ReservationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Reservation)(nil)).Elem()
}

func (o ReservationArrayOutput) ToReservationArrayOutput() ReservationArrayOutput {
	return o
}

func (o ReservationArrayOutput) ToReservationArrayOutputWithContext(ctx context.Context) ReservationArrayOutput {
	return o
}

func (o ReservationArrayOutput) Index(i pulumi.IntInput) ReservationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Reservation {
		return vs[0].([]*Reservation)[vs[1].(int)]
	}).(ReservationOutput)
}

type ReservationMapOutput struct{ *pulumi.OutputState }

func (ReservationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Reservation)(nil)).Elem()
}

func (o ReservationMapOutput) ToReservationMapOutput() ReservationMapOutput {
	return o
}

func (o ReservationMapOutput) ToReservationMapOutputWithContext(ctx context.Context) ReservationMapOutput {
	return o
}

func (o ReservationMapOutput) MapIndex(k pulumi.StringInput) ReservationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Reservation {
		return vs[0].(map[string]*Reservation)[vs[1].(string)]
	}).(ReservationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReservationInput)(nil)).Elem(), &Reservation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservationArrayInput)(nil)).Elem(), ReservationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservationMapInput)(nil)).Elem(), ReservationMap{})
	pulumi.RegisterOutputType(ReservationOutput{})
	pulumi.RegisterOutputType(ReservationArrayOutput{})
	pulumi.RegisterOutputType(ReservationMapOutput{})
}