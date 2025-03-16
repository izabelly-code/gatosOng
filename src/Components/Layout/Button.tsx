interface Button {
    order: string
    text: String
}

function Button({order, text}: Button) {

    // const buttonClass = order == "primary" ? "bg-sky-400" : order == "secondary" ? ""

    return(
        <div className={`inline-flex justify-center items-center button rounded py-2 px-4 cursor-pointer ${order == "primary" ? "bg-sky-400 hover:bg-sky-500" : "border-1 hover:bg-slate-50"}`}>
            {text}
        </div>
    )
}

export default Button