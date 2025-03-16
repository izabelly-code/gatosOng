interface CardProps {
    className?: string
    children: React.ReactNode
}

function Card({className, children}: CardProps) {
    return(
        <div className={`rounded overflow-hidden shadow-lg bg-red-500 border-2 border-red-500 ${className ? className : ``}`}>
            {children}
        </div>
    )
}

export default Card